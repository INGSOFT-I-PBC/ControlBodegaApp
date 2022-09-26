package com.neoterux.controlbodega.core.meta

import android.view.Menu
import android.view.MenuItem
import androidx.annotation.IdRes
import com.neoterux.controlbodega.R

private val permissionList = mapOf<Int, String>(
    R.id.nav_dashboard to "mobile.show_dashboard",
    R.id.nav_physical_inventory to "mobile.can_physical_inventory_scan",
)

fun permissionNameofMenu(menu: MenuItem): String? = permissionList.getOrDefault(menu.itemId, null)

fun canViewMenu(@IdRes id: Int, permission: String) =
    permissionList.getOrDefault(id, null) == permission