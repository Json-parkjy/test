package com.netro.jyp.service;

import com.netro.jyp.model.Board;
import com.netro.jyp.model.User;
import com.netro.jyp.repository.BoardRepository;
import com.netro.jyp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    UserRepository userRepository;

    public Board save(String username, Board board) {
        User user = userRepository.findByUsername(username);
        board.setUser(user);
        return boardRepository.save(board);
    }
}
