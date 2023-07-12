package com.devsuperior.dslist.entities;

import com.devsuperior.dslist.dto.GameMinDTO;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    private Integer posisiton;

    public Belonging() {
    }

    public Belonging(Game game, GameList list, Integer posisiton) {
        id.setGame(game);
        id.setGameList(list);
        this.posisiton = posisiton;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPosisiton() {
        return posisiton;
    }

    public void setPosisiton(Integer posisiton) {
        this.posisiton = posisiton;
    }
}
