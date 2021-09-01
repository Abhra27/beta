package com.me;

import java.util.List;

import com.me.dao.PlayerDAO;
import com.me.dao.TeamDAO;
import com.me.dao.impl.PlayerDAOImpl;
import com.me.dao.impl.TeamDAOImpl;
import com.me.exception.BusinessException;
import com.me.model.Player;
import com.me.model.Team;

public class PlayerMain {

	public static void main(String[] args) {
		PlayerDAO playerDAO=new PlayerDAOImpl();
		/*try {
			List<Player> playerList=playerDAO.getAllPlayers();
			for(Player player:playerList) {
				System.out.println(player);
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
/*	Player player=new Player(101,"Neymar",30,"Rio De Janeiro","M","Football",5641782390L);
		try {
			if(playerDAO.createPlayer(player)==1)
			{
				System.out.println("Player created successfully with below details");
				System.out.println(player);
				
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}*/
       /* int id=104;
        long contact=7899874560L;
		try {
			if(playerDAO.updatePlayer(id, contact)==1)
			{
				System.out.println("Player details updated successfully");
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		int id=105;
		try {
			if(playerDAO.deletePlayer(id)==1)
			{
				System.out.println("Player details deleted successfully");
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}*/
		TeamDAO teamDAO=new TeamDAOImpl();
		Team t1=new Team("RM");
		
		try {
			t1=teamDAO.createTeam(t1);
			if(t1.getId()!=0)
			{
				System.out.println("Team created successfully with below details");
				System.out.println(t1);
			}
		} catch (BusinessException e) {
			System.out.println(e);
		}
		try {
			List<Team> teamList=teamDAO.getAllTeams();
			if(teamList!=null && teamList.size()>0)
			{
				System.out.println("\n\nTotal we have"+teamList.size()+" no of teams in Team table... Below are the details:");
				for(Team team:teamList) {
					System.out.println(team);
				}
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		
			      
				
	
		
	}

}
