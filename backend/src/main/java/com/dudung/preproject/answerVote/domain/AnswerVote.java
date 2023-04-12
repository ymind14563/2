package com.dudung.preproject.answerVote.domain;

import com.dudung.preproject.member.domain.Member;
import jakarta.persistence.*;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class AnswerVote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long answerVoteId;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member memberId;

    private int countAnswerVote;


}