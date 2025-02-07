package jpabasic.datepickproject.dto.user.requset;

import lombok.Getter;

@Getter
public class SignInUserRequestDto {

	private final String email;

	private final String username;

	private final String password;

	public SignInUserRequestDto(String email, String username, String password) {
		this.email = email;
		this.username = username;
		this.password = password;
	}
}
