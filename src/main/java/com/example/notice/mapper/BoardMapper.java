package com.example.notice.mapper;

import com.example.notice.domain.Board;
import com.example.notice.domain.BoardDetails;
import com.example.notice.domain.Search;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {


    // 게시판 리스트 출력
    List<Board> getList(Search params);

//    답글 조회
    List<Board> getCommentList();

    // 게시글 카운트
    int count(Search params);


    // 게시판 작성
    void write(Board board);

    void commentWrite(Board board, BoardDetails parent);
    void commentUpdate(Board board,BoardDetails parent);
    // 게시판 상세 조회
    BoardDetails getBoard(int boardNum);
    BoardDetails getBoardtest(int boardNum,int num);


    // 게시판 수정 페이지
    BoardDetails getUpdateBoard(int boardNum);

    // 게시판 수정
    void boardUpdate(int boardNum, String boardTitle, String boardContent);

    // 게시판 삭제
    void boardDelete(int boardNum);
}
