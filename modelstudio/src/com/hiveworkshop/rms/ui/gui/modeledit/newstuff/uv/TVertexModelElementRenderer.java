package com.hiveworkshop.rms.ui.gui.modeledit.newstuff.uv;

import java.awt.Color;

import com.hiveworkshop.rms.util.Vec2;

public interface TVertexModelElementRenderer {
	void renderFace(Color borderColor, Color color, Vec2 a, Vec2 b, Vec2 c);

	void renderVertex(Color color, Vec2 vertex);
}
