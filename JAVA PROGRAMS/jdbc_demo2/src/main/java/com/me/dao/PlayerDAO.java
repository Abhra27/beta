package com.me.dao;

import java.util.List;

import com.me.exception.BusinessException;
import com.me.model.Player;

public interface PlayerDAO {
	public List<Player> getAllPlayers() throws BusinessException;	
    public int createPlayer(Player player) throws BusinessException;
    public int updatePlayer(int id,long contact) throws BusinessException;
    public int deletePlayer(int id) throws BusinessException;
}
