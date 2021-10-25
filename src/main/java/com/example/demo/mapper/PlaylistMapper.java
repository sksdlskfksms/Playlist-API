package com.example.demo.mapper;

import com.example.demo.code.enums.LocaleType;
import com.example.demo.model.domain.Album;
import com.example.demo.model.domain.Song;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PlaylistMapper {
    @Autowired
    private SqlSessionTemplate mybatis;

    /**
     * 노래 제목으로 앨범을 검색함.
     *
     * @param title 노래 제목
     * @return 앨범 목록.
     */
    public Album searchAlbumByTitle(String title) {
        return mybatis.selectOne("searchAlbumByTitle", title);
    }

    /**
     * 재생 가능 지역으로 앨범을 검색함.
     *
     * @param localeType 재생가능 지역
     * @return 앨범 목록.
     */
    public Album searchAlbumByLocale(final LocaleType localeType) {
        return mybatis.selectOne("searchAlbumByLocale", localeType);
    }

    /**
     * 제목으로 노래 검색
     *
     * @param title 노래 제목
     * @return 검색된 노래 목록.
     */
    public Song findByTilte(String title) {
        return mybatis.selectOne("findByTilte", title);
    }

    /**
     * 재생 가능 지역 으로 노래 검색
     *
     * @param localeType 재생가능 지역
     * @return 검색된 노래 목록.
     */
    public Song findByLocale(LocaleType localeType) {
        return mybatis.selectOne("findByLocale", localeType);
    }

}
