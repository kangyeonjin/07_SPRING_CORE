package com.ohgiraffers.section02.annotation.subsection02.qualifier;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/*
* @qualifier
* 여러개의 빈 객체 중에서 특정 빈 객체를 이름으로 지정하는 어노테이션이다
* @primary 어노테이션과 qualifier 어노테이션이 함께 쓰였을때 qualifier가 우선한다*/

@Service("pokemonServiceQualifier")
public class PokemonService {

    //필드 주입방식
//    @Qualifier("pikachu")
//    @Autowired
    private Pokemon pokemon;

    @Autowired
    public PokemonService(@Qualifier("squirtle") Pokemon pokemon){
        this.pokemon = pokemon;
    }

    public void pokemonAttack(){
        pokemon.attack();
    }

}
