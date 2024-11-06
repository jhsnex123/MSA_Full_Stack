package com.example.springlab.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor     // 생성할 때 넣는다
public class TeamMemberVO {
    private String name;
    private String nicName;
    private String food;


}
