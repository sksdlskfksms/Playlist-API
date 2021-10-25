package com.example.demo.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


/**
 * Created by wody8674@gmail.com o n 2020/01/31.
 */
@Getter
@Entity
@Table(name = "album")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Album extends BaseTimeEntity {


    /** 앨범 ID */
    /* GenerationType.IDENTITY : 기본키 생성 디비에 위임 */
    @Id
    @Column(name = "album_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long albumId;

    /** 앨범 타이틀 */
    @Column(name = "album_title", length = 200, nullable = false)
    private String albumTitle;

    /** 앨범 */
    /* FetchType.Eager : 연관 관계에 있는 Entity들 모두 가져옴
     * FetchType.LAZY : 연관 관계에 있는 Entity를 가져오지 않고, getter로 접근 */
    @OneToMany(mappedBy = "album", fetch = FetchType.LAZY)
    private List<Locale> locales;

    /** 곡 정보 */
    @OneToMany(mappedBy = "album", fetch = FetchType.LAZY)
    private List<Song> songList;

}
