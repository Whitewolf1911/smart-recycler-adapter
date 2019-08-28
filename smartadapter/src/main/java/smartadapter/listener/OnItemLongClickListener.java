package smartadapter.listener;

/*
 * Created by Manne Öhlund on 2019-08-01.
 * Copyright (c) All rights reserved.
 */

import io.github.manneohlund.smartrecycleradapter.R;

/**
 * Default implementation of adapter item row long click listener.
 */
public interface OnItemLongClickListener extends OnViewEventListener {
    @Override
    default int getViewEventId() {
        return R.id.event_on_long_click;
    }
}