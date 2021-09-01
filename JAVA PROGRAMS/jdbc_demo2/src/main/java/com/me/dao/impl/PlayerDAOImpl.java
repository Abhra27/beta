package com.me.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.me.dao.PlayerDAO;
import com.me.dao.dbutil.MySqlDbConnection;
import com.me.exception.BusinessException;
import com.me.model.Player;

public class PlayerDAOImpl implements PlayerDAO {
	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> playerList=new ArrayList<>();
		try(Connection connection=MySqlDbConnection.getConnection()){
			String sql="Select id,name,age,gender,city,sportsName,contact from player";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next())
			{
				Player player=new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setGender(resultSet.getString("gender"));
				player.setCity(resultSet.getString("city"));
				player.setSportsName(resultSet.getString("sportsName"));
				player.setAge(resultSet.getInt("age"));
				player.setContact(resultSet.getLong("contact"));
				playerList.add(player);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);//this will be replaced by logger
			throw new BusinessException("Internal error occured, please contact support");
		}
		return playerList;
	}

	@Override
	public int createPlayer(Player player) throws BusinessException {
		int c=0;
		try(Connection connection=MySqlDbConnection.getConnection()){
			String sql="insert into player (id,name,age,gender,city,sportsName,contact) values(?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);	
			preparedStatement.setInt(1,player.getId());
			preparedStatement.setString(2,player.getName());
			preparedStatement.setInt(3,player.getAge());
			preparedStatement.setString(4,player.getGender());
			preparedStatement.setString(5,player.getCity());
			preparedStatement.setString(6,player.getSportsName());
			preparedStatement.setLong(7,player.getContact());		
			c=preparedStatement.executeUpdate();
		}
		 catch (ClassNotFoundException | SQLException e) {
				System.out.println(e);//this will be replaced by logger
				throw new BusinessException("Internal error occured, please contact support");
			}
		return c;
	}

	@Override
	public int updatePlayer(int id, long contact) throws BusinessException {
		int z=0;
		try(Connection connection=MySqlDbConnection.getConnection()){
			
			String sql="update player set contact=? where id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);	
			preparedStatement.setLong(1,contact);
			preparedStatement.setInt(2,id);	
			z=preparedStatement.executeUpdate();
			
			}
			catch (ClassNotFoundException | SQLException e) {
				System.out.println(e);//this will be replaced by logger
				throw new BusinessException("Internal error occured, please contact support");
			}
		return z;
	}

	@Override
	public int deletePlayer(int id) throws BusinessException {
		int d=0;
        try(Connection connection=MySqlDbConnection.getConnection()){
			
			String sql="delete from player where id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);	
			preparedStatement.setInt(1,id);	
			d=preparedStatement.executeUpdate();
			
			}
			catch (ClassNotFoundException | SQLException e) {
				System.out.println(e);//this will be replaced by logger
				throw new BusinessException("Internal error occured, please contact support");
			}
		
		
		return d;
	}
	

}
