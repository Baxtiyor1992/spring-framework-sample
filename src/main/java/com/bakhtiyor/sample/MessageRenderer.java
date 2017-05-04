package com.bakhtiyor.sample;

public interface MessageRenderer {

	void render();

	void setMessageProvider(MessageProvider provider);

	MessageProvider getMessageProvider();
}