import { SDKOptions } from "../index.js";
import { env } from "../lib/env.js";
import { RedactingLogger } from "../lib/redacting-logger.js";
import { SDKInitHook } from "./types.js";

/**
 * A hook that sets the debugLogger SDK option to a default logger upon SDK initialization if no logger is supplied and debug is enabled.
 * This default logger redacts sensitive information from debug log output.
 */
export class RedactingLoggerHook implements SDKInitHook {

  /**
   * Called when the SDK is initializing. Sets the debugLogger option to a default logger if no logger is supplied and debug is enabled.
   * @param opts The SDK options
   * @returns The modified SDK options with the debugLogger set
   */
  sdkInit(opts: SDKOptions): SDKOptions {
    if (!opts.debugLogger && env().CVENTSDK_DEBUG) {
      opts.debugLogger = new RedactingLogger();
    }
    return opts;
  }

}