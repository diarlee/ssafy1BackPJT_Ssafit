package com.ssafy.board.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.ssafy.board.model.dto.Board;

public class BoardDaoImpl implements BoardDao {
	
	private static BoardDao dao = new BoardDaoImpl();
	
	private List<Board> list = new ArrayList<>(); // 데이터 베이스 대용
	
	public BoardDaoImpl() {
	}
	
	public static BoardDao getInstance() {
		return dao;
	}

	@Override
	public List<Board> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertBoard(Board board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Board selectOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBoard(Board board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoard(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateViewCnt(int id) {
		// TODO Auto-generated method stub
		
	}

}
