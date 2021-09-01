package com.me.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.me.dao.TeamDAO;
import com.me.dao.dbutil.MySqlDbConnection;
import com.me.exception.BusinessException;
import com.me.model.Player;
import com.me.model.Team;

public class TeamDAOImpl implements TeamDAO {

	@Override
	public Team createTeam(Team team) throws BusinessException {
		try(Connection connection=MySqlDbConnection.getConnection()){
			String sql="insert into team(teamName) values (?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, team.getTeamName());
			
			int c=preparedStatement.executeUpdate();
			if(c==1)
			{
				ResultSet resultSet=preparedStatement.getGeneratedKeys();
				if(resultSet.next()) {
					team.setId(resultSet.getInt(1));
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact admin");
		}
		return team;
	}

	@Override
	public List<Team> getAllTeams() throws BusinessException {
		List<Team> teamList=new ArrayList<>();
        try(Connection connection=MySqlDbConnection.getConnection()){
	    String sql="Select id,teamName from team";
	    PreparedStatement preparedStatement=connection.prepareStatement(sql);
	
	    ResultSet resultSet=preparedStatement.executeQuery();
	    while(resultSet.next()) {
	   
		Team team=new Team();
		team.setId(resultSet.getInt("id"));
		team.setTeamName(resultSet.getString("teamName"));
		teamList.add(team);
	    }
}	    
	    catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact admin");
		}
		return teamList;
	
}      
	@Override
	public List<Team> getTeamsByName(String teamName) throws BusinessException {
        try(Connection connection=MySqlDbConnection.getConnection()){
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact admin");
		}
		return null;
	}
  
}
