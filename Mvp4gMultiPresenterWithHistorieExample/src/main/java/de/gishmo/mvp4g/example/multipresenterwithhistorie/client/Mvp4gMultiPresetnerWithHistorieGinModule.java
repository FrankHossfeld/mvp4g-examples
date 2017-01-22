package de.gishmo.mvp4g.example.multipresenterwithhistorie.client;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;

import de.gishmo.mvp4g.example.multipresenterwithhistorie.client.model.ApplicationContext;
import de.gishmo.mvp4g.example.multipresenterwithhistorie.client.model.ApplicationContextProvider;

public class Mvp4gMultiPresetnerWithHistorieGinModule
  extends AbstractGinModule {

  @Override
  protected void configure() {
    bind(ApplicationContext.class).toProvider(ApplicationContextProvider.class)
                                  .in(Singleton.class);
  }
}