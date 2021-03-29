// Generated code from Butter Knife. Do not modify!
package com.fibelatti.countries.presentation.ui.adapters;

import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import com.fibelatti.countries.R;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class CountryAdapter$LoadingViewHolder_ViewBinding<T extends CountryAdapter.LoadingViewHolder> implements Unbinder {
  protected T target;

  public CountryAdapter$LoadingViewHolder_ViewBinding(T target, Finder finder, Object source) {
    this.target = target;

    target.progressBar = finder.findRequiredViewAsType(source, R.id.progress_bar, "field 'progressBar'", ProgressBar.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.progressBar = null;

    this.target = null;
  }
}
