package com.pruebatecnica.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@ApiModel(value = "Dynamic response for service.")
public class GenericResponse<T> {

	@ApiModelProperty(value = "Code of response" , example = "1")
	private int code;
	
	@ApiModelProperty(value = "Dynamic data of response object, string or list.")
	private T data;
	
	@ApiModelProperty(value = "Message of response." , example = "OK")
	private String message;
}
