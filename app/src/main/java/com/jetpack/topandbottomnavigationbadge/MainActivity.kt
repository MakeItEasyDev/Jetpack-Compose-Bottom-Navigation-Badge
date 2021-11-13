package com.jetpack.topandbottomnavigationbadge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.jetpack.topandbottomnavigationbadge.ui.theme.TopAndBottomNavigationBadgeTheme

@ExperimentalMaterialApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TopAndBottomNavigationBadgeTheme {
                Surface(color = MaterialTheme.colors.background) {
                    TopAndBottomNavigationBadge()
                }
            }
        }
    }
}

@ExperimentalMaterialApi
@Composable
fun TopAndBottomNavigationBadge() {
    val badgeCount = remember { mutableStateOf(1) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Compose BadgeBox",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                },
                backgroundColor = MaterialTheme.colors.primary,
                actions = {
                    BadgeBox(
                        badgeContent = {
                            Text(
                                text = "${badgeCount.value}"
                            )
                        }
                    ) {
                        Icon(
                            Icons.Filled.Notifications,
                            "Notifications"
                        )
                    }
                    Spacer(modifier = Modifier.requiredWidth(12.dp))
                },
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(Icons.Filled.Menu, "Menu")
                    }
                }
            )
        },
        content = {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = {
                        badgeCount.value++
                    }
                ) {
                    Text(
                        text = "Update Badge"
                    )
                }
            }
        },
        backgroundColor = Color.White,
        bottomBar = {
            BottomAppBar(
                content = {
                    BottomNavigation {
                        BottomNavigationItem(
                            selected = false,
                            onClick = { },
                            icon = {
                                BadgeBox(
                                    badgeContent = {
                                        Text(
                                            text = "${badgeCount.value}"
                                        )
                                    }
                                ) {
                                    Icon(
                                        Icons.Filled.Home,
                                        "Home"
                                    )
                                }
                            },
                            label = {
                                Text(
                                    text = "Home"
                                )
                            },
                            alwaysShowLabel = false
                        )
                        BottomNavigationItem(
                            selected = false,
                            onClick = { },
                            icon = {
                                BadgeBox(
                                    badgeContent = {
                                        Text(
                                            text = "${badgeCount.value}"
                                        )
                                    }
                                ) {
                                    Icon(
                                        Icons.Filled.Favorite,
                                        "Favorite"
                                    )
                                }
                            },
                            label = {
                                Text(
                                    text = "Favorite"
                                )
                            },
                            alwaysShowLabel = false
                        )
                        BottomNavigationItem(
                            selected = false,
                            onClick = { },
                            icon = {
                                Icon(
                                    Icons.Filled.Search,
                                    "Search"
                                )
                            },
                            label = {
                                Text(
                                    text = "Search"
                                )
                            },
                            alwaysShowLabel = false
                        )
                        BottomNavigationItem(
                            selected = false,
                            onClick = { },
                            icon = {
                                BadgeBox(
                                    badgeContent = {
                                        Text(
                                            text = "${badgeCount.value}"
                                        )
                                    }
                                ) {
                                    Icon(
                                        Icons.Filled.Settings,
                                        "Settings"
                                    )
                                }
                            },
                            label = {
                                Text(
                                    text = "Settings"
                                )
                            },
                            alwaysShowLabel = false
                        )
                        BottomNavigationItem(
                            selected = false,
                            onClick = { },
                            icon = {
                                BadgeBox(
                                    badgeContent = {
                                        Text(
                                            text = "${badgeCount.value}"
                                        )
                                    }
                                ) {
                                    Icon(
                                        Icons.Filled.Person,
                                        "Profile"
                                    )
                                }
                            },
                            label = {
                                Text(
                                    text = "Profile"
                                )
                            },
                            alwaysShowLabel = false
                        )
                    }
                }
            )
        }
    )
}






















