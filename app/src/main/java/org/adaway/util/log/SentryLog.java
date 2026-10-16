package org.adaway.util.log;

import android.app.Application;

/**
 * This class is a helper to initialize and configuration Sentry.
 * <p>
 * Crash reporting is disabled on this build: the Sentry SDK is still a compile time dependency but it is never
 * initialized, so no event, breadcrumb or trace is ever sent to sentry.io. See {@link #isAvailable()}.
 *
 * @author Bruce BUJON (bruce.bujon(at)gmail(dot)com)
 */
public final class SentryLog {
    /**
     * Private constructor.
     */
    private SentryLog() {

    }

    /**
     * Initialize Sentry logging client.
     * <p>
     * Does nothing as crash reporting is disabled on this build.
     *
     * @param application The application instance.
     */
    public static void init(Application application) {
        // Crash reporting is disabled on this build: Sentry is never initialized.
    }

    /**
     * Initialize Sentry logging client.
     * <p>
     * Does nothing as crash reporting is disabled on this build.
     *
     * @param application The application instance.
     * @param enabled Whether the application is allowed to send events to Sentry or not.
     */
    public static void setEnabled(Application application, boolean enabled) {
        // Crash reporting is disabled on this build: Sentry is never initialized.
    }

    /**
     * Record a breadcrumb.
     * <p>
     * Does nothing as crash reporting is disabled on this build.
     *
     * @param message The breadcrumb message.
     */
    public static void recordBreadcrumb(String message) {
        // Crash reporting is disabled on this build: breadcrumbs are dropped.
    }

    /**
     * Check if Sentry crash reporting is available.
     *
     * @return {@code false} as crash reporting is disabled on this build.
     */
    public static boolean isAvailable() {
        return false;
    }
}
