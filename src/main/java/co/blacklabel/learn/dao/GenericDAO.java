package co.blacklabel.learn.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO<T> extends Serializable {
  public List<T> list();

  public <E> T find(E id);

  public void insert(T o);

  public void update(T o);

  public void delete(T o);
}
