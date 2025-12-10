import { SDK_METADATA, SDKOptions } from "../index.js";
import { SDKInitHook } from "./types.js";

/**
 * A hook that sets the User-Agent header on outgoing requests
 * 
 * User Agent header at time of creation: 'cvent/1.0 Cvent-SDK/0.0.1 (typescript ea)'
 */
export class CventUserAgentHook implements SDKInitHook {
  
  /**
   * Called when the SDK is initializing. Sets the User-Agent header.
   * @param opts The SDK options
   * @returns The modified SDK options with the User-Agent header set
   */
  sdkInit(opts: SDKOptions): SDKOptions {
    opts.userAgent = `cvent/1.0 Cvent-SDK/${SDK_METADATA.sdkVersion} (${SDK_METADATA.language} ${SDK_METADATA.openapiDocVersion})`;
    return opts;
  }

}