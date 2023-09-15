package com.ssafy.board.moel.service;

import java.util.List;

import com.ssafy.board.model.dao.BoardDao;
import com.ssafy.board.model.dao.BoardDaoImpl;
import com.ssafy.board.model.dto.Board;

public class BoardServiceImpl implements BoardService {
	
	private static BoardService service = new BoardServiceImpl();
	
	private BoardDao dao = BoardDaoImpl.getInstance();
	
	private BoardServiceImpl() {
		
	}
	
	public static BoardService getInstance() {
		return service;
	}

	@Override
	public List<Board> getList() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public void writeBoard(Board board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Board getBoard(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifyBoard(Board board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeBoard(int id) {
		// TODO Auto-generated method stub
		
	}

}
