package jpabasic.datepickproject.dto.comment.request;

import lombok.Getter;

@Getter
public class CommentRequest {
	private Long userId;
	private String content;
}