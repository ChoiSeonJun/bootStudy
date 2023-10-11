package com.exam.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.dto.DeptDTO;

@RestController
public class TestController {

	// 요청URL: http://localhost:8090/app/board/num/10
	// 요청URL: http://localhost:8090/app/board/10 ==> num값을 10 이용해서 GET(select) 할 의도임
	@GetMapping("/board/{num}")
	public String aaa(@PathVariable("num") String num) {
		System.out.println("@GetMapping-조회용 " + num);
		return "get";
	}

	// 요청URL: http://localhost:8090/app/board2/10/hong/name/hong
	// 요청URL: http://localhost:8090/app/board2/20/kim  ==> num값 20 username값 kim을 이용해서 POST(insert) 할 의도임
	@PostMapping("/board2/{num}/{username}")
	public String bbb(@PathVariable("num") String num, @PathVariable("username") String username) {
		System.out.println("@@PostMapping-저장용 " + num + "\t" + username);
		return "post";
	}

	// 요청URL: http://localhost:8090/app/board2/20/kim  ==> num값 20 username값 kim을 이용해서 PUT(update) 할 의도임
	@PutMapping("/board2/{num}/{username}") //맵핑값이 같아도  @POST, @PUT 형식으로 다르므로 이상없이 작동된다.
	public String ccc(@PathVariable("num") String num, @PathVariable("username") String username) {
		System.out.println("@@PutMapping-수정용 " + num + "\t" + username);
		return "put";
	}

	// 요청URL: http://localhost:8090/app/board/10 ==> num값을 10 이용해서 DELETE(delete) 할 의도임
	@DeleteMapping("/board/{num}")
	public String ddd(@PathVariable("num") String num) {
		System.out.println("@@DeleteMapping-삭제용 " + num);
		return "delete";
	}
}




