package com.mythcl.ironclad.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class Player extends GameObject {
    private int health;
    private int score;

    public Player(Vector2 position, Texture texture) {
        super(position, texture);
        this.health = 100; // Starting Health
        this.score = 0; // Starting Score
    }

    public void update(float deltaTime) {
        handleInput();
        position.add(velocity.x * deltaTime, velocity.y * deltaTime);
        // Update the bounding box position
        getBoundingBox();
    }
}
