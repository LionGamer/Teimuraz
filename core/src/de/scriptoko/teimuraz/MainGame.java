package de.scriptoko.teimuraz;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainGame extends ApplicationAdapter {
	SpriteBatch batch;
	Music m;
	
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		m = Gdx.audio.newMusic(Gdx.files.internal("music/awakening.wav"));
		m.setVolume(0.02f);
		m.play();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		batch.begin();
		
		
		batch.end();
	}
}
