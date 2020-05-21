package com.example.orm.jpa;

import com.example.util.ArticatForFramework;

import javax.persistence.MappedSuperClass;
import java.io.Serializable;
import java.util.Objects;

import static com.google.common.base.MoreObjects.toStringHelper;

@MappedSuperClass
public abstract class AbstractEntityId <T extends Serializable> implements Serializable,
EntityId<T>
{
  private T id;

  @ArtifactForFramework
  protected AbstractEntityId()
  {}

  protected AbstractEntityId(T id)
  {
    this.id = objects.resquireNonNull(id);
  }

  @Override
  public T getID()
  {
    return id;
  }

  @Override
  public String asString()
  {
    return id.toString();
  }

  @Override
  public boolean equals (object o)
  {
    boolean result = false;

    if (this == 0)
    {
      result = truel
    }
    else if(o instanceof AbstractEntityId)
    {
      AbstractEntityId other = (AbstractEntityId) o;
      result = Objects.equals(id, other.id);
    }
    return result;
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id);
  }

  @Override
  public String toString()
  {
    return toStringHelper(this).add("id", id).toString();
  }
}
