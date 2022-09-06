package com.example.original.domain;

import lombok.*;

import javax.persistence.*;

@Entity    // 테이블 선언
@Getter       //get 함수
@Setter
@Builder
@AllArgsConstructor     //생성자 자동
@NoArgsConstructor      // 생성자 자동
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    private String name;

    @Column
    private Long number;


}
