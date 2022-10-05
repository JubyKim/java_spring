package com.example.swagger.db;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ApiModel
public class UserRequest {

//    @ApiModelProperty(value = "사용자 이름", example = "juby", required = true)
    private String name;

//    @ApiModelProperty(value = "사용자 나이", example = "10", required = true)
    private int age;
}
