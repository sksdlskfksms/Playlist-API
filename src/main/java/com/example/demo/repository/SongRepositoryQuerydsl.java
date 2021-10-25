package com.example.demo.repository;

import com.example.demo.code.enums.LocaleType;
import com.example.demo.model.domain.Song;

/**
 * Created by wody8674@gmail.com on 2020/01/31.
 */
public interface SongRepositoryQuerydsl {

    /**
     * 제목으로 노래 검색
     * @param title 노래 제목
     * @return 검색된 노래 목록.
     */
    Song findByTilte(final String title);

    /**
     * 재생 가능 지역 으로 노래 검색
     * @param localeType 재생가능 지역
     * @return 검색된 노래 목록.
     */
    Song findByLocale(final LocaleType localeType);

}
