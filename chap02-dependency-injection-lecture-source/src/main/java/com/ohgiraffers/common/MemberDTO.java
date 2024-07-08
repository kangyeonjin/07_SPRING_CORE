package com.ohgiraffers.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MemberDTO {

    private int sequence;       //회원번호
    private String name;
    private String phone;
    private String email;
    private Account persomalAccount;  //개인계좌

}
