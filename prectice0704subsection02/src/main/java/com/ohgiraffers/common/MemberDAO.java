package com.ohgiraffers.common;

import java.util.HashMap;
import java.util.Map;

public class MemberDAO {

    private final Map<Integer, MemberDTO> memberMap;

    public MemberDAO(){
        memberMap = new HashMap<Integer, MemberDTO>();
        memberMap.put(1, new MemberDTO(1, "user01", "pass01", "유관순"));

    }

}
