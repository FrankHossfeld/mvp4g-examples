package de.gishmo.mvp4g.example.multipresenterwithhistorie.client.ui.content;

import java.util.List;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.view.ReverseViewInterface;

import de.gishmo.mvp4g.example.multipresenterwithhistorie.client.delegate.ConfirmCommand;
import de.gishmo.mvp4g.example.multipresenterwithhistorie.client.ui.content.IContentView.Presenter;
import de.gishmo.mvp4g.example.multipresenterwithhistorie.shared.dto.Person;

public interface IContentView
  extends IsWidget,
          ReverseViewInterface<Presenter> {

  void addItem(String id,
               String name,
               Widget container,
               boolean isDirty);

  void close(String id);

  void remove(final String id);

  void refresh(String id,
               String newName,
               boolean isDirty);

  void select(String id);

  void selectUebersicht();

  void edit(List<Person> people);

  interface Presenter {

    void doClose(String id);

    void doConfirmClose(String id,
                        ConfirmCommand confirmCommand);

    void doRemove(String id);

    void doUpdatePersonGrid();

    void doShowPerson(long id);
  }
}
