package com.example.springcalculator.controller;

import com.example.springcalculator.component.Calculator;
import com.example.springcalculator.component.DollarCalculator;
import com.example.springcalculator.component.MarketAPI;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.MockMvcAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcResultMatchersDsl;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
@SpringBootTest
@WebMvcTest
@AutoConfigureWebMvc
@Import({Calculator.class, DollarCalculator.class})
public class CalculatorAPIControllerTest {

    @MockBean
    private MarketAPI marketApi;


    @Autowired
    private MockMvc mockMvc;
    @BeforeEach
    public void init() {
        Mockito.when(marketApi.connnect()).thenReturn(3000);
    }

    public void sumTest() throws Exception {
        //http://localhost:8080/api/sum

        mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/api/sum")
                        .queryParam("x", 10)
                        .queryParam("y",10))
                .andExpect(MockMvcResultMatchers.content().string("60000"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());

    }

}
