// Generated code from Butter Knife. Do not modify!
package com.fibelatti.countries.presentation.ui.adapters;

import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import com.fibelatti.countries.R;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class CountryAdapter$DataViewHolder_ViewBinding<T extends CountryAdapter.DataViewHolder> implements Unbinder {
  protected T target;

  public CountryAdapter$DataViewHolder_ViewBinding(T target, Finder finder, Object source) {
    this.target = target;

    target.countryFlag = finder.findRequiredViewAsType(source, R.id.image_view_country_flag, "field 'countryFlag'", ImageView.class);
    target.countryName = finder.findRequiredViewAsType(source, R.id.text_view_country_name, "field 'countryName'", TextView.class);
    target.countryRegion = finder.findRequiredViewAsType(source, R.id.text_view_country_region, "field 'countryRegion'", TextView.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.countryFlag = null;
    target.countryName = null;
    target.countryRegion = null;

    this.target = null;
  }
}
