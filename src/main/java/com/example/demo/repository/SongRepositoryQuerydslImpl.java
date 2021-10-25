package com.example.demo.repository;

import com.example.demo.code.enums.LocaleType;
import com.example.demo.mapper.PlaylistMapper;
import com.example.demo.model.domain.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wody8674@gmail.com on 2020/01/31.
 */
@Service
public class SongRepositoryQuerydslImpl implements SongRepositoryQuerydsl {
    @Autowired
    private PlaylistMapper playlistMapper ;

    /**
     * 제목으로 노래 검색
     *
     * @param title 노래 제목
     * @return 검색된 노래 목록.
     */
    public Song findByTilte(final String title) {
        return playlistMapper.findByTilte(title);
    }

    /**
     * 재생 가능 지역 으로 노래 검색
     *
     * @param localeType 재생가능 지역
     * @return 검색된 노래 목록.
     */
    public Song findByLocale(final LocaleType localeType) {
        return playlistMapper.findByLocale(localeType);
    }
}
