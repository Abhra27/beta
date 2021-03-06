package com.me.dao;

import java.util.List;

import com.me.exception.BusinessException;
import com.me.model.Team;

public interface TeamDAO {
		
    public Team createTeam(Team team) throws BusinessException;
    public List<Team> getAllTeams() throws BusinessException;
    public List<Team> getTeamsByName(String teamName) throws BusinessException;
}
