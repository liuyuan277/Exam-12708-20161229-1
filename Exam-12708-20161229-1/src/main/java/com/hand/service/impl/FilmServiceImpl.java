package com.hand.service.impl;

import com.hand.dto.Film;
import com.hand.mapper.FilmMapper;
import com.hand.service.FilmService;

public class FilmServiceImpl implements FilmService {


	private FilmMapper filmMapper;
	
	public FilmMapper getFilmMapper() {
		return filmMapper;
	}

	public void setFilmMapper(FilmMapper filmMapper) {
		this.filmMapper = filmMapper;
	}

	@Override
	public int insert(Film film) {
		int t=filmMapper.insertFilm(film);
		System.out.println("Insert Film id ="+film.getFilm_id());
		return t;
	}


}
