package com.example.helloworld;

import software.constructs.Construct;
import software.amazon.awscdk.Duration;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.sqs.Queue;

public class CdkHelloWorldJavaProjectStack extends Stack {
    public CdkHelloWorldJavaProjectStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public CdkHelloWorldJavaProjectStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        // The code that defines your stack goes here
        final Queue queue = Queue.Builder.create(this, "CdkHelloWorldJavaProjectQueue")
                 .visibilityTimeout(Duration.seconds(180))
                 .build();

    }
}



