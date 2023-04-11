package com.dudung.preproject.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @ManyToOne(fetch = FetchType.LAZY)
    private QuestionVote questionVote;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "answerVote_id")
    private AnswerVote answerVote;


}
