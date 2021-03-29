// Generated code from Butter Knife. Do not modify!
package com.fibelatti.countries.presentation.ui.activities;

import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import com.fibelatti.countries.R;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class CountryDetailActivity_ViewBinding<T extends CountryDetailActivity> implements Unbinder {
  protected T target;

  private View view2131493130;

  private View view2131493158;

  public CountryDetailActivity_ViewBinding(final T target, Finder finder, Object source) {
    this.target = target;

    View view;
    target.rootLayout = finder.findRequiredViewAsType(source, R.id.root_layout, "field 'rootLayout'", CoordinatorLayout.class);
    target.toolbar = finder.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.layoutPlaceholder = finder.findRequiredViewAsType(source, R.id.layout_placeholder, "field 'layoutPlaceholder'", RelativeLayout.class);
    target.layoutContent = finder.findRequiredViewAsType(source, R.id.layout_content_details, "field 'layoutContent'", ScrollView.class);
    view = finder.findRequiredView(source, R.id.image_view_country_flag, "field 'countryFlag' and method 'handlePosterClick'");
    target.countryFlag = finder.castView(view, R.id.image_view_country_flag, "field 'countryFlag'", ImageView.class);
    view2131493130 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.handlePosterClick();
      }
    });
    target.countryFlagExpanded = finder.findRequiredViewAsType(source, R.id.image_view_expanded, "field 'countryFlagExpanded'", ImageView.class);
    target.countryName = finder.findRequiredViewAsType(source, R.id.text_view_country_name, "field 'countryName'", TextView.class);
    target.countryRegion = finder.findRequiredViewAsType(source, R.id.text_view_country_region, "field 'countryRegion'", TextView.class);
    target.countryCapital = finder.findRequiredViewAsType(source, R.id.text_view_country_capital, "field 'countryCapital'", TextView.class);
    target.countrySubregion = finder.findRequiredViewAsType(source, R.id.text_view_country_subregion, "field 'countrySubregion'", TextView.class);
    target.countryPopulation = finder.findRequiredViewAsType(source, R.id.text_view_country_population, "field 'countryPopulation'", TextView.class);
    target.countryNativeName = finder.findRequiredViewAsType(source, R.id.text_view_country_native_name, "field 'countryNativeName'", TextView.class);
    target.countryDemonym = finder.findRequiredViewAsType(source, R.id.text_view_country_demonym, "field 'countryDemonym'", TextView.class);
    target.countryCallingCodes = finder.findRequiredViewAsType(source, R.id.text_view_country_calling_codes, "field 'countryCallingCodes'", TextView.class);
    target.countryCurrencies = finder.findRequiredViewAsType(source, R.id.text_view_country_currencies, "field 'countryCurrencies'", TextView.class);
    target.countryLanguages = finder.findRequiredViewAsType(source, R.id.text_view_country_languages, "field 'countryLanguages'", TextView.class);
    target.countryTimezones = finder.findRequiredViewAsType(source, R.id.text_view_country_timezones, "field 'countryTimezones'", TextView.class);
    target.countryBorders = finder.findRequiredViewAsType(source, R.id.text_view_country_borders, "field 'countryBorders'", TextView.class);
    view = finder.findRequiredView(source, R.id.button_try_again, "method 'tryReload'");
    view2131493158 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.tryReload();
      }
    });
  }

  @Override
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.rootLayout = null;
    target.toolbar = null;
    target.layoutPlaceholder = null;
    target.layoutContent = null;
    target.countryFlag = null;
    target.countryFlagExpanded = null;
    target.countryName = null;
    target.countryRegion = null;
    target.countryCapital = null;
    target.countrySubregion = null;
    target.countryPopulation = null;
    target.countryNativeName = null;
    target.countryDemonym = null;
    target.countryCallingCodes = null;
    target.countryCurrencies = null;
    target.countryLanguages = null;
    target.countryTimezones = null;
    target.countryBorders = null;

    view2131493130.setOnClickListener(null);
    view2131493130 = null;
    view2131493158.setOnClickListener(null);
    view2131493158 = null;

    this.target = null;
  }
}
