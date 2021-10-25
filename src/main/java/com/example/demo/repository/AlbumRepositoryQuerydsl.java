package com.example.demo.repository;

import com.example.demo.code.enums.LocaleType;
import com.example.demo.model.domain.Album;

/**
 * Created by wody8674@gmail.com on 2020/01/31.
 */
public interface AlbumRepositoryQuerydsl {

    /**
     * 노래 제목으로 앨범을 검색함.
     * @param title 노래 제목
     * @return 앨범 목록.
     */
    Album searchAlbumByTitle(final String title);

    /**
     * 재생 가능 지역으로 앨범을 검색함.
     * @param localeType 재생가능 지역
     * @return 앨범 목록.
     */
    Album searchAlbumByLocale(final LocaleType localeType);

}
