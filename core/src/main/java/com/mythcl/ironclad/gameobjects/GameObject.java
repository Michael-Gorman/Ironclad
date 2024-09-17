package com.mythcl.ironclad.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public abstract class GameObject {
    protected Vector2 position;  // Position and Velocity: These determine where the object is and how it's moving.
    protected Vector2 velocity;
    protected Texture texture;  // Texture: The image representing the object.
    protected Rectangle boundingBox; // Bounding Box: Used for collision detection.

    // Initialize the fields in the constructor
    public GameObject(Vector2 position, Texture texture) {
        this.position = position;
        this.texture = texture;
        this.velocity = new Vector2(0,0);
        this.boundingBox = new Rectangle(position.x, position.y, texture.getWidth(), texture.getHeight());
    }
    // Declare an abstract update method that will be implemented by subclasses to update their state each frame.
    public abstract void update(float deltaTime);

    // Render Method: Draws the object on the screen.
    public void render(SpriteBatch batch) {
        batch.draw(texture, position.x, position.y);
    }

    // Updates and returns the bounding box for collision detection.
    public Rectangle getBoundingBox() {
        boundingBox.setPosition(position.x, position.y);
        return boundingBox;
    }


}
