package com.example.springlab.controller;

import com.example.springlab.domain.TeamDTO;
import com.example.springlab.domain.TeamMemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyTeamController2 {
    @RequestMapping(value = "/myTeam2/{action}", produces = "application/json; charset=utf-8")
    @ResponseBody
    public TeamDTO myTeam(){

        TeamDTO myteam = new TeamDTO();
        myteam.setTeamName("먹코살코");
        List<TeamMemberVO> teamMember = new ArrayList<>();
        teamMember.add(new TeamMemberVO("김슬기", "SG", "고기"));
        teamMember.add(new TeamMemberVO("장현수", "JHS", "피자"));
        teamMember.add(new TeamMemberVO("정지용", "정지빵", "리조또"));
        teamMember.add(new TeamMemberVO("한규현", "굼바", "라멘"));

        myteam.setTeamMember(teamMember);

        return myteam;
    }
}
