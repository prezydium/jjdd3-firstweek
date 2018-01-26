package com.infoshare;

import java.util.Objects;

public class EqualsTest {

    private int id, size;
    private String name, type;


    public EqualsTest(int id, int size, String name, String type) {

        this.id = id;
        this.size = size;
        this.name = name;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsTest that = (EqualsTest) o;
        return id == that.id &&
                size == that.size &&
                Objects.equals(name, that.name) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, size, name, type);
    }
}
