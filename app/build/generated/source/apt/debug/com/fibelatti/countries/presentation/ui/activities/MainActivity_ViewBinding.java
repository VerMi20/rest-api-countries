// Generated code from Butter Knife. Do not modify!
package com.fibelatti.countries.presentation.ui.activities;

import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import com.fibelatti.countries.R;
import com.nightonke.boommenu.BoomMenuButton;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class MainActivity_ViewBinding<T extends MainActivity> implements Unbinder {
  protected T target;

  private View view2131493158;

  public MainActivity_ViewBinding(final T target, Finder finder, Object source) {
    this.target = target;

    View view;
    target.rootLayout = finder.findRequiredViewAsType(source, R.id.root_layout, "field 'rootLayout'", CoordinatorLayout.class);
    target.toolbar = finder.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.layoutPlaceholder = finder.findRequiredViewAsType(source, R.id.layout_placeholder, "field 'layoutPlaceholder'", RelativeLayout.class);
    target.layoutPlaceholderNoResults = finder.findRequiredViewAsType(source, R.id.layout_placeholder_no_results, "field 'layoutPlaceholderNoResults'", RelativeLayout.class);
    target.layoutContent = finder.findRequiredViewAsType(source, R.id.layout_content, "field 'layoutContent'", RelativeLayout.class);
    target.swipeRefresh = finder.findRequiredViewAsType(source, R.id.swipe_refresh, "field 'swipeRefresh'", SwipeRefreshLayout.class);
    target.recyclerViewContent = finder.findRequiredViewAsType(source, R.id.recycler_view_content, "field 'recyclerViewContent'", RecyclerView.class);
    target.boomMenuButton = finder.findRequiredViewAsType(source, R.id.bmb, "field 'boomMenuButton'", BoomMenuButton.class);
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
    target.layoutPlaceholderNoResults = null;
    target.layoutContent = null;
    target.swipeRefresh = null;
    target.recyclerViewContent = null;
    target.boomMenuButton = null;

    view2131493158.setOnClickListener(null);
    view2131493158 = null;

    this.target = null;
  }
}
