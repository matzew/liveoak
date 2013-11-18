/*
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at http://www.eclipse.org/legal/epl-v10.html
 */
package io.liveoak.container.auth;

/**
 * @author <a href="mailto:mposolda@redhat.com">Marek Posolda</a>
 */
public class TestAuthConstants {

    // Expired token for username: "john", realm: "realmName1", app: "appName1", realmRoles ["user"], appRoles: []
    public static final String EXPIRED_TOKEN = "eyJhbGciOiJSUzI1NiJ9.eyJpc3N1ZWRGb3IiOiJhcHBOYW1lMSIsImp0aSI6IjEtMTM4MzMyMzY4MDUwMiIsImV4cCI6MTM4MzMyMzY5MCwiaWF0IjoxMzgzMzIzNjgwLCJhdWQiOiJyZWFsbU5hbWUxIiwicHJuIjoiam9obiIsImFsbG93ZWQtb3JpZ2lucyI6W10sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJ1c2VycyJdfSwicmVzb3VyY2VfYWNjZXNzIjp7ImFwcE5hbWUxIjp7InZlcmlmeV9jYWxsZXIiOmZhbHNlfX19.aOvaCIl9qt0jN-YQp4tzIXYhpSNzstSFq_3xIDt03-FEWwh7ZZsKnum1mtLZJ3GazKcntzYgHGnIrF_s3PnbVVJRWd2ZMlmgaQjmMJE8XoCLLKoLydtsUk0ASwu6l-D0ls7tysBJ7BqRDE9ZwSEb3GD6_ibBmaygEgHrJ0188ZQ";

    // Token with invalid signature (actually AuthConstants.PUBLIC_KEY2 should be valid key to verify this)
    public static final String INVALID_SIGNATURE_TOKEN = "eyJhbGciOiJSUzI1NiJ9.eyJpc3N1ZWRGb3IiOiJhcHBOYW1lMSIsImp0aSI6IjEtMTM4MzMyNzkzNjUzNCIsImlhdCI6MTM4MzMyNzkzNiwiYXVkIjoicmVhbG1OYW1lMSIsInBybiI6ImpvaG5fcmVhbG1Vc2VyIiwiYWxsb3dlZC1vcmlnaW5zIjpbXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbInVzZXIiXX0sInJlc291cmNlX2FjY2VzcyI6eyJhcHBOYW1lMSI6eyJyb2xlcyI6W10sInZlcmlmeV9jYWxsZXIiOmZhbHNlfX19.YMyeyPKymjyRZpB_vlD1qPl8aaLmVQOzpq7QJD2KIHpXIyFXS3qhyBEB40jJwtXIF08BqsKqK8C9tBaADJKuGgOW5Zsy9PHu9YR7sjNYEThFr6vbZSsiCTT295gcJpKy43rFACKa8carqMsxD1rDPdsHObKWcKauzATwVA9L3xE";

    // Valid token for username: "john_realmUser", realm: "realmName1", app: "appName1", realmRoles ["user"], appRoles: []
    public static final String JOHN_REALMUSER_TOKEN = "eyJhbGciOiJSUzI1NiJ9.eyJpc3N1ZWRGb3IiOiJhcHBOYW1lMSIsImp0aSI6IjEtMTM4MzMyNzQ5MTQ2MCIsImlhdCI6MTM4MzMyNzQ5MSwiYXVkIjoicmVhbG1OYW1lMSIsInBybiI6ImpvaG5fcmVhbG1Vc2VyIiwiYWxsb3dlZC1vcmlnaW5zIjpbXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbInVzZXIiXX0sInJlc291cmNlX2FjY2VzcyI6eyJhcHBOYW1lMSI6eyJyb2xlcyI6W10sInZlcmlmeV9jYWxsZXIiOmZhbHNlfX19.pHQVKw0JLlpeu8mh535kupu1EekEED0ovV7dIOdnEw4CI8t1wnYsZiWUChUaP1nMjOT21lX7z9Fq-AqbfOGboqigCYE4VC89fa9rfuKokzJgRL2zS4RAcphMbDpzQLAuUMKm1_xp7aZrriAjPiARohfqAkkTTwDjlX3A_YFJKG4";

    // Valid token for username: "john_appUser", realm: "realmName1", app: "appName1", realmRoles [], appRoles: ["appName1": ["user"]]
    public static final String JOHN_APPUSER_TOKEN = "eyJhbGciOiJSUzI1NiJ9.eyJpc3N1ZWRGb3IiOiJhcHBOYW1lMSIsImp0aSI6IjEtMTM4MzMyNjU5MDExMyIsImlhdCI6MTM4MzMyNjU5MCwiYXVkIjoicmVhbG1OYW1lMSIsInBybiI6ImpvaG5fYXBwVXNlciIsImFsbG93ZWQtb3JpZ2lucyI6W10sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6W119LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYXBwTmFtZTEiOnsicm9sZXMiOlsidXNlciJdLCJ2ZXJpZnlfY2FsbGVyIjpmYWxzZX19fQ.J48nt4a06QGQfPuHa7Wrof9604KLNlzvwD307LGWXybw_9_hpQbGys0qGdFd-dwkry8lnhHGDQ_rqIv7yyLz3CmeJB1sZFcxJYQZmiOttMK4JXB0b1miTxq1WGOLl4eBbkrLo-XwKzW9iclGEb0h3Y20huqWma_IiOltKch1EmQ";

    // Valid token for username: "john_appPowerUser", realm: "realmName1", app: "appName1", realmRoles [], appRoles: ["appName1": ["powerUser"]]
    public static final String JOHN_APPPOWERUSER_TOKEN = "eyJhbGciOiJSUzI1NiJ9.eyJpc3N1ZWRGb3IiOiJhcHBOYW1lMSIsImp0aSI6IjEtMTM4MzMyNjU0Nzk0NSIsImlhdCI6MTM4MzMyNjU0NywiYXVkIjoicmVhbG1OYW1lMSIsInBybiI6ImpvaG5fYXBwUG93ZXJVc2VyIiwiYWxsb3dlZC1vcmlnaW5zIjpbXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbXX0sInJlc291cmNlX2FjY2VzcyI6eyJhcHBOYW1lMSI6eyJyb2xlcyI6WyJwb3dlclVzZXIiXSwidmVyaWZ5X2NhbGxlciI6ZmFsc2V9fX0.kxtYcvF74NiuV64zlnvHBx1fahFNQC8oFZEGCuULzeii2w11GnvxuzMsNVFb8-z3r5LN1d2yLNZE7GuO6dNMqkcXDukUcUEezFDht2fFlClNYjC1s0cyMNaHd5fU3W4dpuXRUx5he3lWGHWCICALG19zMetdLLgALXAt1BYvxHY";

    // Valid token for username: "john_appUser_appPowerUser", realm: "realmName1", app: "appName1", realmRoles [], appRoles: ["appName1": ["user", "powerUser"]]
    public static final String JOHN_APPUSER_APPPOWERUSER_TOKEN = "eyJhbGciOiJSUzI1NiJ9.eyJpc3N1ZWRGb3IiOiJhcHBOYW1lMSIsImp0aSI6IjEtMTM4MzMyNjUwNzc3OCIsImlhdCI6MTM4MzMyNjUwNywiYXVkIjoicmVhbG1OYW1lMSIsInBybiI6ImpvaG5fYXBwVXNlcl9hcHBQb3dlclVzZXIiLCJhbGxvd2VkLW9yaWdpbnMiOltdLCJyZWFsbV9hY2Nlc3MiOnsicm9sZXMiOltdfSwicmVzb3VyY2VfYWNjZXNzIjp7ImFwcE5hbWUxIjp7InJvbGVzIjpbInBvd2VyVXNlciIsInVzZXIiXSwidmVyaWZ5X2NhbGxlciI6ZmFsc2V9fX0.UjT3ib3TU-s_-V2U2-KBQjXSBACCvcvbfZGLk9Oenq0488VWBeSUZ9lM2PEViZH1oQx2lF-Z7CtjvVsELOEOVTugBtuRlekA868oaUy07HzCOlvBFRW0E65jUXFi31aQZeWXSsoim8XatE11yMsFvum4FI9ZLqzc3Lrvjdbe6cg";

    // Valid token for username: "john_appUser_appAdmin", realm: "realmName1", app: "appName1", realmRoles [], appRoles: ["appName1": ["user", "admin"]]
    public static final String JOHN_APPUSER_APPADMIN_TOKEN = "eyJhbGciOiJSUzI1NiJ9.eyJpc3N1ZWRGb3IiOiJhcHBOYW1lMSIsImp0aSI6IjEtMTM4MzMyNjQ2MTQxNSIsImlhdCI6MTM4MzMyNjQ2MSwiYXVkIjoicmVhbG1OYW1lMSIsInBybiI6ImpvaG5fYXBwVXNlcl9hcHBBZG1pbiIsImFsbG93ZWQtb3JpZ2lucyI6W10sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6W119LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYXBwTmFtZTEiOnsicm9sZXMiOlsiYWRtaW4iLCJ1c2VyIl0sInZlcmlmeV9jYWxsZXIiOmZhbHNlfX19.TLjtc44LhRk_Q5y46JKGLu0rXggDSXkFWzHPGnKKok9Iu1eMG2HCYkN4ckILbmwhJevjAPwqsqrPqXw0n7O4T-UwhRQ5P8btBjlEGNH8Yorc4GcSkzgsoP8-26rkfvFWQlIn1m7In5JWeul_s_OJekAyptRtytG33I-yDxAT6Kc";

    // Token for username: "john", realm: "invalidRealm", app: "appName1"
    public static final String INVALID_AUDIENCE_TOKEN = "eyJhbGciOiJSUzI1NiJ9.eyJpc3N1ZWRGb3IiOiJhcHBOYW1lMSIsImp0aSI6IjEtMTM4MzMyNDgzMjcyMSIsImlhdCI6MTM4MzMyNDgzMiwiYXVkIjoiaW52YWxpZFJlYWxtIiwicHJuIjoiam9obiIsImFsbG93ZWQtb3JpZ2lucyI6W10sInJlc291cmNlX2FjY2VzcyI6eyJhcHBOYW1lMSI6eyJyb2xlcyI6WyJhZG1pbiIsInVzZXIiXSwidmVyaWZ5X2NhbGxlciI6ZmFsc2V9fX0.P7s8aKu555DslVT0-GxbnT8ZCJPNizhe8uADnBAxOo2SSFrB0Q2kt_mkFE_IXSh_Q_0m_pUrjB28hqBBwV_0XAo5KR-bk8evczyrOI5sPO3Wc1rr7ze5qfIdvH_SMfeBwlXUEERSLn3pFxcGZHnmOzCFNSdZlOld0QMPzgTaUB8";

    // Token for username: "john", realm: "realmName1", app: "invalidAppName"
    public static final String INVALID_ISSUEDFOR_TOKEN = "eyJhbGciOiJSUzI1NiJ9.eyJpc3N1ZWRGb3IiOiJpbnZhbGlkQXBwTmFtZSIsImp0aSI6IjEtMTM4MzMyNDg4MzYxOCIsImlhdCI6MTM4MzMyNDg4MywiYXVkIjoicmVhbG1OYW1lMSIsInBybiI6ImpvaG4iLCJhbGxvd2VkLW9yaWdpbnMiOltdLCJyZXNvdXJjZV9hY2Nlc3MiOnsiYXBwTmFtZTEiOnsicm9sZXMiOlsiYWRtaW4iLCJ1c2VyIl0sInZlcmlmeV9jYWxsZXIiOmZhbHNlfX19.HBCmwrJWp8tvva6Q-skV6bA9xNGAVhp_Bpc_5N-6pgntWudibyiOr7CWDMJ02NS-a6Mz6NiJ-gvsvGEA-k4IKPGrBfz88ODD9lX2QjFiq_02VUcVk0Bn99eQyaWYEXZIEro2ih-8ikeEoqOYGtxeKewRrPM4S9EMrUan_h0NNK4";

    // Token for username: null, realm: "realmName1", app: "appName1"
    public static final String NULLUSER_TOKEN = "eyJhbGciOiJSUzI1NiJ9.eyJpc3N1ZWRGb3IiOiJhcHBOYW1lMSIsImp0aSI6IjEtMTM4MzMyNTAzNzEzNCIsImlhdCI6MTM4MzMyNTAzNywiYXVkIjoicmVhbG1OYW1lMSIsImFsbG93ZWQtb3JpZ2lucyI6W10sInJlc291cmNlX2FjY2VzcyI6eyJhcHBOYW1lMSI6eyJyb2xlcyI6WyJhZG1pbiIsInVzZXIiXSwidmVyaWZ5X2NhbGxlciI6ZmFsc2V9fX0.eDWjgUnksB2RR67OPboiUg8z_krrXMl5r60cZBXyF_95QVcEbsqZM-tA21u5H2glx7oGBbAAMJOaFEUI-WSACkOHFnmPBZCd2zvCw88ER2QBSxo5iFiDGGbWayWcC-ocEiYYzroaVDWLGqLFoGj3bAtnBQWOmC_2kV4qdEhyZGw";


}
