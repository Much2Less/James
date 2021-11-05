package com.mygdx.james;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class JamesMain extends ApplicationAdapter {

    private OrthographicCamera camera;
    private SpriteBatch batch;

	@Override
    public void create() {
    	camera = new OrthographicCamera();
    	camera.setToOrtho(false, 800, 480);



    	Gdx.input.setInputProcessor(new InputAdapter() {
    		@Override
			public boolean touchDown(int x, int y, int pointer, int button) {
    			y = Gdx.graphics.getHeight() - y;



    			return true;
			}
		});

		batch = new SpriteBatch();
	}


/*
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}
*/

	@Override
	public void render () {
	    ScreenUtils.clear(0,0,02.f,1);

	    batch.begin();
	    batch.end();

	}
	
	@Override
	public void dispose () {

	}

}
