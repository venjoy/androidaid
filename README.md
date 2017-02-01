# Androidaid

Helpers and classes for android.


## Helpers

### Social Media Login 

Easy to go Social media login library.

```
config = {
    // "base" screen that point to auth Endpoint
    "base"  :  "",

    "providers"  :  {
        // google
        "Google"  :  {// 'id' is your google client id
            "enabled"  :  true
            "keys"  :  {"id"  :  "", "secret"  :  "" ),
            },

        // facebook
        "Facebook"  :  {// 'id' is your facebook application id
            "enabled"  :  true,
            "keys"  :  {"id"  :  "", "secret"  :  "" },
            "scope"  :  "email, user_about_me, user_birthday, user_hometown" // optional
            },

        // twitter
        "Twitter"  :  {// 'key' is your twitter application consumer key
            "enabled"  :  true,
            "keys"  :  {"key"  :  "", "secret"  :  "" )
            },

        // and so on ...
        },

    "debug_mode"  :  false ,

    // to enable logging, set 'debug_mode' to true, then provide here a path of a writable file
    "debug_file"  :  "",
};

SocialAuth auth = new SocialAuth($config);
 
SocialSite twitter = $auth.authenticate( "Twitter" );

SocialProfile $profile = twitter.getUserProfile();

System.out.println(profile.getDisplayName());
```