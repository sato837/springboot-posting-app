package com.example.postingapp.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PostRegisterForm {
	
	@NotBlank(message = "タイトルを入力してください。")
	@Size(max = 40, message = "タイトルは最大40文字です。")
	public String title;
	
	@NotBlank(message = "本文を入力してください。")
	@Size(max = 200, message = "本文は最大200文字です。")
	public String content;

}
